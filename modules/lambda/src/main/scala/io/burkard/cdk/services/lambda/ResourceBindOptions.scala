package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceBindOptions {

  def apply(
    resourceProperty: Option[String] = None
  ): software.amazon.awscdk.services.lambda.ResourceBindOptions =
    (new software.amazon.awscdk.services.lambda.ResourceBindOptions.Builder)
      .resourceProperty(resourceProperty.orNull)
      .build()
}
