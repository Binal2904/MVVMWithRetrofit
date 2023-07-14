package com.test.mvvmwithretrofit.model

data class ProfileData(val entrepreneurId: Int = 0,
                val code: String = "",
                val role: Int = 0,
                val updatedAt: String = "",
                val parentId: Int = 0,
                val name: String = "",
                val mobile: String = "",
                val createdAt: String = "",
                val emailVerifiedAt: String = "",
                val id: Int = 0,
                val deletedAt: String = "",
                val email: String = "")


data class ProfileDataResponse(val result: Boolean = false,
                               val data: ProfileData,
                               val message: String = "")


