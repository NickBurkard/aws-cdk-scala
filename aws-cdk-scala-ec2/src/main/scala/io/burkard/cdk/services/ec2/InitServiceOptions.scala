package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InitServiceOptions {

  def apply(
    ensureRunning: Option[Boolean] = None,
    enabled: Option[Boolean] = None,
    serviceRestartHandle: Option[software.amazon.awscdk.services.ec2.InitServiceRestartHandle] = None
  ): software.amazon.awscdk.services.ec2.InitServiceOptions =
    (new software.amazon.awscdk.services.ec2.InitServiceOptions.Builder)
      .ensureRunning(ensureRunning.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .serviceRestartHandle(serviceRestartHandle.orNull)
      .build()
}
