package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IncrementalPullConfigProperty {

  def apply(
    datetimeTypeFieldName: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty.Builder)
      .datetimeTypeFieldName(datetimeTypeFieldName.orNull)
      .build()
}
