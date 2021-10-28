package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TimeConversionOptions {

  def apply(
    integral: Option[Boolean] = None
  ): software.amazon.awscdk.TimeConversionOptions =
    (new software.amazon.awscdk.TimeConversionOptions.Builder)
      .integral(integral.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
