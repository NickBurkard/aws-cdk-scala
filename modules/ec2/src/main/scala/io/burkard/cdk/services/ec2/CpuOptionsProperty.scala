package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CpuOptionsProperty {

  def apply(
    threadsPerCore: Option[Number] = None,
    coreCount: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty.Builder)
      .threadsPerCore(threadsPerCore.orNull)
      .coreCount(coreCount.orNull)
      .build()
}
