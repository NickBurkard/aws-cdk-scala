package io.burkard.cdk.services.stepfunctions


sealed abstract class AuthType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.AuthType)
  extends Product
    with Serializable


object AuthType {
  implicit def toAws(value: AuthType): software.amazon.awscdk.services.stepfunctions.tasks.AuthType =
    Option(value).map(_.underlying).orNull

  case object NoAuth
    extends AuthType(software.amazon.awscdk.services.stepfunctions.tasks.AuthType.NO_AUTH)

  case object IamRole
    extends AuthType(software.amazon.awscdk.services.stepfunctions.tasks.AuthType.IAM_ROLE)

  case object ResourcePolicy
    extends AuthType(software.amazon.awscdk.services.stepfunctions.tasks.AuthType.RESOURCE_POLICY)
}
