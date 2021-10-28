package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LazyAnyValueOptions {

  def apply(
    displayHint: Option[String] = None,
    omitEmptyArray: Option[Boolean] = None
  ): software.amazon.awscdk.LazyAnyValueOptions =
    (new software.amazon.awscdk.LazyAnyValueOptions.Builder)
      .displayHint(displayHint.orNull)
      .omitEmptyArray(omitEmptyArray.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
