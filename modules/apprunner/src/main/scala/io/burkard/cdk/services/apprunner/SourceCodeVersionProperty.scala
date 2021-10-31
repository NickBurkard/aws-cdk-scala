package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceCodeVersionProperty {

  def apply(
    `type`: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}
