package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RotationScheduleProps {

  def apply(
    secret: software.amazon.awscdk.services.secretsmanager.ISecret,
    rotationLambda: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    automaticallyAfter: Option[software.amazon.awscdk.Duration] = None,
    hostedRotation: Option[software.amazon.awscdk.services.secretsmanager.HostedRotation] = None
  ): software.amazon.awscdk.services.secretsmanager.RotationScheduleProps =
    (new software.amazon.awscdk.services.secretsmanager.RotationScheduleProps.Builder)
      .secret(secret)
      .rotationLambda(rotationLambda.orNull)
      .automaticallyAfter(automaticallyAfter.orNull)
      .hostedRotation(hostedRotation.orNull)
      .build()
}
