package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VPCProperty {

  def apply(
    vpcRegion: String,
    vpcId: String
  ): software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty =
    (new software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty.Builder)
      .vpcRegion(vpcRegion)
      .vpcId(vpcId)
      .build()
}
