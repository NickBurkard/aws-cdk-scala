package io.burkard.cdk.services.codedeploy


sealed abstract class CustomLambdaDeploymentConfigType(val underlying: software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType)
  extends Product
    with Serializable


object CustomLambdaDeploymentConfigType {
  implicit def toAws(value: CustomLambdaDeploymentConfigType): software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType =
    Option(value).map(_.underlying).orNull

  case object Canary
    extends CustomLambdaDeploymentConfigType(software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType.CANARY)

  case object Linear
    extends CustomLambdaDeploymentConfigType(software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType.LINEAR)
}
