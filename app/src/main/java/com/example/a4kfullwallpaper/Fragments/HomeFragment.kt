package com.example.a4kfullwallpaper.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.a4kfullwallpaper.Adapters.RvAdapter
import com.example.a4kfullwallpaper.Adapters.VpAdapter
import com.example.a4kfullwallpaper.R
import com.example.a4kfullwallpaper.databinding.FragmentHomeBinding
import com.example.a4kfullwallpaper.models.DataRv
import com.example.a4kfullwallpaper.utils.MyData
import com.example.a4kfullwallpaper.utils.obj
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    lateinit var vpAdapter: VpAdapter
    lateinit var rvAdapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            tvTitle.text = "Home"
            vpAdapter = VpAdapter(object : VpAdapter.VpAction {
                override fun rvAdapter(recyclerView: RecyclerView) {
                    rvAdapter = RvAdapter(object : RvAdapter.RvAction {
                        override fun imageClick(dataRv: DataRv, position: Int) {
                            val navOption = NavOptions.Builder()
                            navOption.setEnterAnim(R.anim.anim_1)
                            navOption.setExitAnim(R.anim.anim_2)
                            navOption.setPopEnterAnim(R.anim.anim_1)
                            navOption.setPopExitAnim(R.anim.anim_2)

                            obj.c = 1

                            findNavController().navigate(
                                R.id.photoViewFragment,
                                bundleOf("keyPosition" to position), navOption.build()
                            )
                        }
                    }, obj.rvList1)
                    recyclerView.adapter = rvAdapter
                }
            }, obj.vpList)
            binding.vp.adapter = vpAdapter
            TabLayoutMediator(tabLayout, vp) { tab, position ->
                tab.text = obj.vpList[position].name
            }.attach()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.apply {
            bottomNavigateView.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_1 -> {
                        tvTitle.text = "Home"
                        vpAdapter = VpAdapter(object : VpAdapter.VpAction {
                            override fun rvAdapter(recyclerView: RecyclerView) {
                                rvAdapter = RvAdapter(object : RvAdapter.RvAction {
                                    override fun imageClick(dataRv: DataRv, position: Int) {
                                        val navOption = NavOptions.Builder()
                                        navOption.setEnterAnim(R.anim.anim_1)
                                        navOption.setExitAnim(R.anim.anim_2)
                                        navOption.setPopEnterAnim(R.anim.anim_1)
                                        navOption.setPopExitAnim(R.anim.anim_2)

                                        obj.c = 1

                                        findNavController().navigate(
                                            R.id.photoViewFragment,
                                            bundleOf("keyPosition" to position), navOption.build()
                                        )
                                    }
                                }, obj.rvList1)
                                recyclerView.adapter = rvAdapter
                            }
                        }, obj.vpList)
                        binding.vp.adapter = vpAdapter
                        TabLayoutMediator(tabLayout, vp) { tab, position ->
                            tab.text = obj.vpList[position].name
                        }.attach()
                    }

                    R.id.menu_2 -> {
                        tvTitle.text = "Popular"
                        vpAdapter = VpAdapter(object : VpAdapter.VpAction {
                            override fun rvAdapter(recyclerView: RecyclerView) {
                                rvAdapter = RvAdapter(object : RvAdapter.RvAction {
                                    override fun imageClick(dataRv: DataRv, position: Int) {
                                        val navOption = NavOptions.Builder()
                                        navOption.setEnterAnim(R.anim.anim_1)
                                        navOption.setExitAnim(R.anim.anim_2)
                                        navOption.setPopEnterAnim(R.anim.anim_1)
                                        navOption.setPopExitAnim(R.anim.anim_2)

                                        obj.c = 2

                                        findNavController().navigate(
                                            R.id.photoViewFragment,
                                            bundleOf("keyPosition" to position), navOption.build()
                                        )
                                    }
                                }, obj.rvList2)
                                recyclerView.adapter = rvAdapter
                            }
                        }, obj.vpList)
                        binding.vp.adapter = vpAdapter
                        TabLayoutMediator(tabLayout, vp) { tab, position ->
                            tab.text = obj.vpList[position].name
                        }.attach()
                    }

                    R.id.menu_3 -> {
                        tvTitle.text = "Random"
                        vpAdapter = VpAdapter(object : VpAdapter.VpAction {
                            override fun rvAdapter(recyclerView: RecyclerView) {
                                rvAdapter = RvAdapter(object : RvAdapter.RvAction {
                                    override fun imageClick(dataRv: DataRv, position: Int) {
                                        val navOption = NavOptions.Builder()
                                        navOption.setEnterAnim(R.anim.anim_1)
                                        navOption.setExitAnim(R.anim.anim_2)
                                        navOption.setPopEnterAnim(R.anim.anim_1)
                                        navOption.setPopExitAnim(R.anim.anim_2)

                                        obj.c = 3

                                        findNavController().navigate(
                                            R.id.photoViewFragment,
                                            bundleOf("keyPosition" to position), navOption.build()
                                        )
                                    }
                                }, obj.rvList3)
                                recyclerView.adapter = rvAdapter
                            }
                        }, obj.vpList)
                        binding.vp.adapter = vpAdapter
                        TabLayoutMediator(tabLayout, vp) { tab, position ->
                            tab.text = obj.vpList[position].name
                        }.attach()
                    }

                    R.id.menu_4 -> {
                        tvTitle.text = "My Favourites"
                        vpAdapter = VpAdapter(object : VpAdapter.VpAction {
                            override fun rvAdapter(recyclerView: RecyclerView) {
                                rvAdapter = RvAdapter(object : RvAdapter.RvAction {
                                    override fun imageClick(dataRv: DataRv, position: Int) {
                                        val navOption = NavOptions.Builder()
                                        navOption.setEnterAnim(R.anim.anim_1)
                                        navOption.setExitAnim(R.anim.anim_2)
                                        navOption.setPopEnterAnim(R.anim.anim_1)
                                        navOption.setPopExitAnim(R.anim.anim_2)

                                        obj.c = 4

                                        findNavController().navigate(
                                            R.id.photoViewFragment,
                                            bundleOf("keyPosition" to position), navOption.build()
                                        )
                                    }
                                }, obj.rvList4)
                                recyclerView.adapter = rvAdapter
                            }
                        }, obj.vpList)
                        binding.vp.adapter = vpAdapter
                        TabLayoutMediator(tabLayout, vp) { tab, position ->
                            tab.text = obj.vpList[position].name
                        }.attach()
                    }
                }
                true
            }
        }
        MyData.actionLive.observe(viewLifecycleOwner) {
            when (it) {
                0 -> {
                    binding.tvTitle.text = "Home"
                    binding.bottomNavigateView.getMenu().findItem(R.id.menu_1).setChecked(true)
                    vpAdapter = VpAdapter(object : VpAdapter.VpAction {
                        override fun rvAdapter(recyclerView: RecyclerView) {
                            rvAdapter = RvAdapter(object : RvAdapter.RvAction {
                                override fun imageClick(dataRv: DataRv, position: Int) {
                                    val navOption = NavOptions.Builder()
                                    navOption.setEnterAnim(R.anim.anim_1)
                                    navOption.setExitAnim(R.anim.anim_2)
                                    navOption.setPopEnterAnim(R.anim.anim_1)
                                    navOption.setPopExitAnim(R.anim.anim_2)

                                    obj.c = 1

                                    findNavController().navigate(
                                        R.id.photoViewFragment,
                                        bundleOf("keyPosition" to position), navOption.build()
                                    )
                                }
                            }, obj.rvList1)
                            recyclerView.adapter = rvAdapter
                        }
                    }, obj.vpList)
                    binding.vp.adapter = vpAdapter
                    TabLayoutMediator(binding.tabLayout, binding.vp) { tab, position ->
                        tab.text = obj.vpList[position].name
                    }.attach()
                }

                1 -> {
                    binding.tvTitle.text = "Popular"
                    binding.bottomNavigateView.getMenu().findItem(R.id.menu_2).setChecked(true)
                    vpAdapter = VpAdapter(object : VpAdapter.VpAction {
                            override fun rvAdapter(recyclerView: RecyclerView) {
                                rvAdapter = RvAdapter(object : RvAdapter.RvAction {
                                    override fun imageClick(dataRv: DataRv, position: Int) {
                                        val navOption = NavOptions.Builder()
                                        navOption.setEnterAnim(R.anim.anim_1)
                                        navOption.setExitAnim(R.anim.anim_2)
                                        navOption.setPopEnterAnim(R.anim.anim_1)
                                        navOption.setPopExitAnim(R.anim.anim_2)

                                        obj.c = 2

                                        findNavController().navigate(
                                            R.id.photoViewFragment,
                                            bundleOf("keyPosition" to position), navOption.build()
                                        )
                                    }
                                }, obj.rvList2)
                                recyclerView.adapter = rvAdapter
                            }
                        }, obj.vpList)
                        binding.vp.adapter = vpAdapter
                        TabLayoutMediator(binding.tabLayout, binding.vp) { tab, position ->
                            tab.text = obj.vpList[position].name
                        }.attach()
                }
                2 -> {
                    binding.tvTitle.text = "Random"
                    binding.bottomNavigateView.getMenu().findItem(R.id.menu_3).setChecked(true)
                    vpAdapter = VpAdapter(object : VpAdapter.VpAction {
                        override fun rvAdapter(recyclerView: RecyclerView) {
                            rvAdapter = RvAdapter(object : RvAdapter.RvAction {
                                override fun imageClick(dataRv: DataRv, position: Int) {
                                    val navOption = NavOptions.Builder()
                                    navOption.setEnterAnim(R.anim.anim_1)
                                    navOption.setExitAnim(R.anim.anim_2)
                                    navOption.setPopEnterAnim(R.anim.anim_1)
                                    navOption.setPopExitAnim(R.anim.anim_2)

                                    obj.c = 3

                                    findNavController().navigate(
                                        R.id.photoViewFragment,
                                        bundleOf("keyPosition" to position), navOption.build()
                                    )
                                }
                            }, obj.rvList3)
                            recyclerView.adapter = rvAdapter
                        }
                    }, obj.vpList)
                    binding.vp.adapter = vpAdapter
                    TabLayoutMediator(binding.tabLayout, binding.vp) { tab, position ->
                        tab.text = obj.vpList[position].name
                    }.attach()
                }
                3 -> {
                    binding.tvTitle.text = "Liked"
                    binding.bottomNavigateView.getMenu().findItem(R.id.menu_4).setChecked(true)
                    vpAdapter = VpAdapter(object : VpAdapter.VpAction {
                        override fun rvAdapter(recyclerView: RecyclerView) {
                            rvAdapter = RvAdapter(object : RvAdapter.RvAction {
                                override fun imageClick(dataRv: DataRv, position: Int) {
                                    val navOption = NavOptions.Builder()
                                    navOption.setEnterAnim(R.anim.anim_1)
                                    navOption.setExitAnim(R.anim.anim_2)
                                    navOption.setPopEnterAnim(R.anim.anim_1)
                                    navOption.setPopExitAnim(R.anim.anim_2)

                                    obj.c = 4

                                    findNavController().navigate(
                                        R.id.photoViewFragment,
                                        bundleOf("keyPosition" to position),
                                        navOption.build()
                                    )
                                }
                            }, obj.rvList4)
                            recyclerView.adapter = rvAdapter
                        }
                    }, obj.vpList)
                    binding.vp.adapter = vpAdapter
                    TabLayoutMediator(binding.tabLayout, binding.vp) { tab, position ->
                        tab.text = obj.vpList[position].name
                    }.attach()
                }
                4 -> binding.tvTitle.text = "History"
                5 -> binding.tvTitle.text = "About"
            }
        }

        return binding.root
    }
}