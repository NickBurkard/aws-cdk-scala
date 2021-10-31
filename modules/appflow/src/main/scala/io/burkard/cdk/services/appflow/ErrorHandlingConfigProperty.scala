package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ErrorHandlingConfigProperty {

  def apply(
    bucketPrefix: Option[String] = None,
    failOnFirstError: Option[Boolean] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty.Builder)
      .bucketPrefix(bucketPrefix.orNull)
      .failOnFirstError(failOnFirstError.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bucketName(bucketName.orNull)
      .build()
}
