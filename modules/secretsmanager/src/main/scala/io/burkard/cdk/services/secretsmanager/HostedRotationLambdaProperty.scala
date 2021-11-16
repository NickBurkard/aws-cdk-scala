package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HostedRotationLambdaProperty {

  def apply(
    rotationType: String,
    vpcSecurityGroupIds: Option[String] = None,
    masterSecretArn: Option[String] = None,
    masterSecretKmsKeyArn: Option[String] = None,
    rotationLambdaName: Option[String] = None,
    vpcSubnetIds: Option[String] = None,
    kmsKeyArn: Option[String] = None
  ): software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty =
    (new software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty.Builder)
      .rotationType(rotationType)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.orNull)
      .masterSecretArn(masterSecretArn.orNull)
      .masterSecretKmsKeyArn(masterSecretKmsKeyArn.orNull)
      .rotationLambdaName(rotationLambdaName.orNull)
      .vpcSubnetIds(vpcSubnetIds.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .build()
}
