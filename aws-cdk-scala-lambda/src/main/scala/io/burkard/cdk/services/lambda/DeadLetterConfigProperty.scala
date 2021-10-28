package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeadLetterConfigProperty {

  def apply(
    targetArn: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty =
    (new software.amazon.awscdk.services.lambda.CfnFunction.DeadLetterConfigProperty.Builder)
      .targetArn(targetArn.orNull)
      .build()
}
