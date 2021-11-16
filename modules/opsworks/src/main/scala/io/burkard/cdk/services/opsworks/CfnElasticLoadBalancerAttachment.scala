package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnElasticLoadBalancerAttachment {

  def apply(
    internalResourceId: String,
    layerId: String,
    elasticLoadBalancerName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment =
    software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment.Builder
      .create(stackCtx, internalResourceId)
      .layerId(layerId)
      .elasticLoadBalancerName(elasticLoadBalancerName)
      .build()
}
