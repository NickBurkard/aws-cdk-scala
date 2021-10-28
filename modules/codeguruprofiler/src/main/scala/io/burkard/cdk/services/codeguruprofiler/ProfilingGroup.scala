package io.burkard.cdk.services.codeguruprofiler

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProfilingGroup {

  def apply(
    internalResourceId: String,
    profilingGroupName: Option[String] = None,
    computePlatform: Option[software.amazon.awscdk.services.codeguruprofiler.ComputePlatform] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup =
    software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup.Builder
      .create(stackCtx, internalResourceId)
      .profilingGroupName(profilingGroupName.orNull)
      .computePlatform(computePlatform.orNull)
      .build()
}
