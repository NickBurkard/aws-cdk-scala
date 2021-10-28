package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssemblyBuildOptions {

  def apply: software.amazon.awscdk.cxapi.AssemblyBuildOptions =
    (new software.amazon.awscdk.cxapi.AssemblyBuildOptions.Builder)
      
      .build()
}
