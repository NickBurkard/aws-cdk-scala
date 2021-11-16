package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEgressOnlyInternetGateway {

  def apply(
    internalResourceId: String,
    vpcId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway =
    software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId)
      .build()
}
