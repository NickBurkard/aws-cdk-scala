package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RotationSingleUserOptions {

  def apply(
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    endpoint: Option[software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint] = None,
    excludeCharacters: Option[String] = None,
    automaticallyAfter: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.rds.RotationSingleUserOptions =
    (new software.amazon.awscdk.services.rds.RotationSingleUserOptions.Builder)
      .vpcSubnets(vpcSubnets.orNull)
      .endpoint(endpoint.orNull)
      .excludeCharacters(excludeCharacters.orNull)
      .automaticallyAfter(automaticallyAfter.orNull)
      .build()
}
