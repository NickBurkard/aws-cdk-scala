package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Spacer {

  def apply(
    height: Option[Number] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.Spacer =
    software.amazon.awscdk.services.cloudwatch.Spacer.Builder
      .create()
      .height(height.orNull)
      .width(width.orNull)
      .build()
}
