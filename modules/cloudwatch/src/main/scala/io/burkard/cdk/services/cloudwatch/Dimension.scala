package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Dimension {

  def apply(
    name: String,
    value: AnyRef
  ): software.amazon.awscdk.services.cloudwatch.Dimension =
    (new software.amazon.awscdk.services.cloudwatch.Dimension.Builder)
      .name(name)
      .value(value)
      .build()
}
