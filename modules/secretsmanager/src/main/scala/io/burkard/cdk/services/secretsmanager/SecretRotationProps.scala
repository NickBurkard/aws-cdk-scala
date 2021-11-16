package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretRotationProps {

  def apply(
    application: software.amazon.awscdk.services.secretsmanager.SecretRotationApplication,
    secret: software.amazon.awscdk.services.secretsmanager.ISecret,
    target: software.amazon.awscdk.services.ec2.IConnectable,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    masterSecret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    endpoint: Option[software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    excludeCharacters: Option[String] = None,
    automaticallyAfter: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretRotationProps =
    (new software.amazon.awscdk.services.secretsmanager.SecretRotationProps.Builder)
      .application(application)
      .secret(secret)
      .target(target)
      .vpc(vpc)
      .masterSecret(masterSecret.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .endpoint(endpoint.orNull)
      .securityGroup(securityGroup.orNull)
      .excludeCharacters(excludeCharacters.orNull)
      .automaticallyAfter(automaticallyAfter.orNull)
      .build()
}
