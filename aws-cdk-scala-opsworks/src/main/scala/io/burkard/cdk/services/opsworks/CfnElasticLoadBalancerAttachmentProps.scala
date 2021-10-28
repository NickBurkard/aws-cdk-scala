package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
