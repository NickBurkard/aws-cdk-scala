package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RotationSchedule {

  def apply(
    internalResourceId: String,
    secret: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None,
    rotationLambda: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    automaticallyAfter: Option[software.amazon.awscdk.Duration] = None,
    hostedRotation: Option[software.amazon.awscdk.services.secretsmanager.HostedRotation] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.secretsmanager.RotationSchedule =
    software.amazon.awscdk.services.secretsmanager.RotationSchedule.Builder
      .create(stackCtx, internalResourceId)
      .secret(secret.orNull)
      .rotationLambda(rotationLambda.orNull)
      .automaticallyAfter(automaticallyAfter.orNull)
      .hostedRotation(hostedRotation.orNull)
      .build()
}
