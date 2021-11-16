package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagsEntryProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
