package io.burkard.cdk.cxapi

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssemblyBuildOptions {

  def apply(
    runtimeInfo: Option[software.amazon.awscdk.cxapi.RuntimeInfo] = None
  ): software.amazon.awscdk.cxapi.AssemblyBuildOptions =
    (new software.amazon.awscdk.cxapi.AssemblyBuildOptions.Builder)
      .runtimeInfo(runtimeInfo.orNull)
      .build()
}
