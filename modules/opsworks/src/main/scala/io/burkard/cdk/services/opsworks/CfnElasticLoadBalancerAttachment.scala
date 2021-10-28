package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnElasticLoadBalancerAttachment {

  def apply(
    internalResourceId: String,
    layerId: Option[String] = None,
    elasticLoadBalancerName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment =
    software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment.Builder
      .create(stackCtx, internalResourceId)
      .layerId(layerId.orNull)
      .elasticLoadBalancerName(elasticLoadBalancerName.orNull)
      .build()
}