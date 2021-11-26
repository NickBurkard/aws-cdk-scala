package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IngressLoadBalancerAddressOptions {

  def apply(
    timeout: Option[software.amazon.awscdk.Duration] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions =
    (new software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions.Builder)
      .timeout(timeout.orNull)
      .namespace(namespace.orNull)
      .build()
}
