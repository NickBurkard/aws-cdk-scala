package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RotationScheduleOptions {

  def apply(
    rotationLambda: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    automaticallyAfter: Option[software.amazon.awscdk.Duration] = None,
    hostedRotation: Option[software.amazon.awscdk.services.secretsmanager.HostedRotation] = None
  ): software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions =
    (new software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions.Builder)
      .rotationLambda(rotationLambda.orNull)
      .automaticallyAfter(automaticallyAfter.orNull)
      .hostedRotation(hostedRotation.orNull)
      .build()
}
