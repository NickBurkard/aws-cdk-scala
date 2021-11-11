package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagsEntryProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty =
    (new software.amazon.awscdk.services.stepfunctions.CfnStateMachine.TagsEntryProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
