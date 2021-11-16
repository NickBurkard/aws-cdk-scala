package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnElasticLoadBalancerAttachmentProps {

  def apply(
    layerId: String,
    elasticLoadBalancerName: String
  ): software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps =
    (new software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps.Builder)
      .layerId(layerId)
      .elasticLoadBalancerName(elasticLoadBalancerName)
      .build()
}
