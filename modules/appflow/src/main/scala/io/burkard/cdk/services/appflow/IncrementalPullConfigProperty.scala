package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IncrementalPullConfigProperty {

  def apply(
    datetimeTypeFieldName: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty.Builder)
      .datetimeTypeFieldName(datetimeTypeFieldName.orNull)
      .build()
}
