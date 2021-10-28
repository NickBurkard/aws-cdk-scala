package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
