package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssemblyBuildOptions {

  def apply: software.amazon.awscdk.cxapi.AssemblyBuildOptions =
    (new software.amazon.awscdk.cxapi.AssemblyBuildOptions.Builder)
      
      .build()
}
