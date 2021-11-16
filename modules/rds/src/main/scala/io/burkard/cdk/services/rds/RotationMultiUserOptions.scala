package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RotationMultiUserOptions {

  def apply(
    secret: software.amazon.awscdk.services.secretsmanager.ISecret,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    endpoint: Option[software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint] = None,
    excludeCharacters: Option[String] = None,
    automaticallyAfter: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.rds.RotationMultiUserOptions =
    (new software.amazon.awscdk.services.rds.RotationMultiUserOptions.Builder)
      .secret(secret)
      .vpcSubnets(vpcSubnets.orNull)
      .endpoint(endpoint.orNull)
      .excludeCharacters(excludeCharacters.orNull)
      .automaticallyAfter(automaticallyAfter.orNull)
      .build()
}
