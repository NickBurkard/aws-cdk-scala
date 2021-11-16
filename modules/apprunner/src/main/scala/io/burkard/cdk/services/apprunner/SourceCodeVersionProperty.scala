package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceCodeVersionProperty {

  def apply(
    `type`: String,
    value: String
  ): software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty.Builder)
      .`type`(`type`)
      .value(value)
      .build()
}
