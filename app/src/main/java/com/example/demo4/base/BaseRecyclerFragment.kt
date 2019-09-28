package com.example.demo4.base

import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.demo4.R
import com.example.demo4.databinding.FragmentRecyclerviewBinding
import com.scwang.smartrefresh.layout.api.RefreshLayout
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener
import com.scwang.smartrefresh.layout.listener.OnRefreshListener

abstract class BaseRecyclerFragment<A : BaseQuickAdapter<*, BaseViewHolder>> :
    BaseFragment<FragmentRecyclerviewBinding>(),
    BaseQuickAdapter.OnItemChildClickListener, BaseQuickAdapter.OnItemChildLongClickListener,
    OnRefreshListener, OnLoadMoreListener {

    lateinit var adapter: A
    lateinit var layoutManager: RecyclerView.LayoutManager

    override fun getLayoutId(): Int {
        return R.layout.fragment_recyclerview
    }

    override fun initView() {
        adapter = iniAdapter()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        layoutManager = initLayoutManager()
        dataBinding.recyclerView.layoutManager = layoutManager
        dataBinding.recyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.HORIZONTAL
            )
        )
        dataBinding.recyclerView.adapter = adapter
    }

    public fun initLayoutManager(): RecyclerView.LayoutManager {
        return LinearLayoutManager(context)
    }

    override fun initEvent() {
        adapter.onItemChildClickListener = this
        adapter.onItemChildLongClickListener = this
        dataBinding.refreshLayout.setOnRefreshListener(this)
        dataBinding.refreshLayout.setOnLoadMoreListener(this)
    }

    abstract fun iniAdapter(): A

    override fun onItemChildClick(
        adapter: BaseQuickAdapter<*, out BaseViewHolder>?,
        view: View?,
        position: Int
    ) {

    }

    override fun onItemChildLongClick(
        adapter: BaseQuickAdapter<*, *>?,
        view: View?,
        position: Int
    ): Boolean {
        return false
    }

    override fun onRefresh(refreshLayout: RefreshLayout) {

    }

    override fun onLoadMore(refreshLayout: RefreshLayout) {

    }
}