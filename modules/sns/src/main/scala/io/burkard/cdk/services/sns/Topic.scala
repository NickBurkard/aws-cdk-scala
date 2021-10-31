package io.burkard.cdk.services.sns

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Topic {

  def apply(
    internalResourceId: String,
    displayName: Option[String] = None,
    topicName: Option[String] = None,
    contentBasedDeduplication: Option[Boolean] = None,
    masterKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    fifo: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sns.Topic =
    software.amazon.awscdk.services.sns.Topic.Builder
      .create(stackCtx, internalResourceId)
      .displayName(displayName.orNull)
      .topicName(topicName.orNull)
      .contentBasedDeduplication(contentBasedDeduplication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .masterKey(masterKey.orNull)
      .fifo(fifo.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
