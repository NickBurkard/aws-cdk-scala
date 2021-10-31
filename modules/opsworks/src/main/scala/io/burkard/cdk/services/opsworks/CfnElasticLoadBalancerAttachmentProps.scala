package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnElasticLoadBalancerAttachmentProps {

  def apply(
    layerId: Option[String] = None,
    elasticLoadBalancerName: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps =
    (new software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder)
      .layerId(layerId.orNull)
      .elasticLoadBalancerName(elasticLoadBalancerName.orNull)
      .build()
}
