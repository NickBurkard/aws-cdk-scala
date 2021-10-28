package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEgressOnlyInternetGateway {

  def apply(
    internalResourceId: String,
    vpcId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway =
    software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId.orNull)
      .build()
}
