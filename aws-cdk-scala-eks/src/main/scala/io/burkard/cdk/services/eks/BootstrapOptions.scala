package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BootstrapOptions {

  def apply(
    useMaxPods: Option[Boolean] = None,
    dockerConfigJson: Option[String] = None,
    dnsClusterIp: Option[String] = None,
    enableDockerBridge: Option[Boolean] = None,
    awsApiRetryAttempts: Option[Number] = None,
    kubeletExtraArgs: Option[String] = None,
    additionalArgs: Option[String] = None
  ): software.amazon.awscdk.services.eks.BootstrapOptions =
    (new software.amazon.awscdk.services.eks.BootstrapOptions.Builder)
      .useMaxPods(useMaxPods.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dockerConfigJson(dockerConfigJson.orNull)
      .dnsClusterIp(dnsClusterIp.orNull)
      .enableDockerBridge(enableDockerBridge.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .awsApiRetryAttempts(awsApiRetryAttempts.orNull)
      .kubeletExtraArgs(kubeletExtraArgs.orNull)
      .additionalArgs(additionalArgs.orNull)
      .build()
}
