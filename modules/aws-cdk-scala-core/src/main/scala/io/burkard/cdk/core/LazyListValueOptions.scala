package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LazyListValueOptions {

  def apply(
    omitEmpty: Option[Boolean] = None,
    displayHint: Option[String] = None
  ): software.amazon.awscdk.LazyListValueOptions =
    (new software.amazon.awscdk.LazyListValueOptions.Builder)
      .omitEmpty(omitEmpty.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .displayHint(displayHint.orNull)
      .build()
}
