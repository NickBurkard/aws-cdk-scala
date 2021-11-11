package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretRotationProps {

  def apply(
    masterSecret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    endpoint: Option[software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    application: Option[software.amazon.awscdk.services.secretsmanager.SecretRotationApplication] = None,
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    excludeCharacters: Option[String] = None,
    automaticallyAfter: Option[software.amazon.awscdk.Duration] = None,
    target: Option[software.amazon.awscdk.services.ec2.IConnectable] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretRotationProps =
    (new software.amazon.awscdk.services.secretsmanager.SecretRotationProps.Builder)
      .masterSecret(masterSecret.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .endpoint(endpoint.orNull)
      .securityGroup(securityGroup.orNull)
      .application(application.orNull)
      .secret(secret.orNull)
      .excludeCharacters(excludeCharacters.orNull)
      .automaticallyAfter(automaticallyAfter.orNull)
      .target(target.orNull)
      .vpc(vpc.orNull)
      .build()
}
