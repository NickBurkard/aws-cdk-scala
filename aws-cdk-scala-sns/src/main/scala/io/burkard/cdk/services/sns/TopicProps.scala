package io.burkard.cdk.services.sns

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TopicProps {

  def apply(
    displayName: Option[String] = None,
    topicName: Option[String] = None,
    contentBasedDeduplication: Option[Boolean] = None,
    masterKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    fifo: Option[Boolean] = None
  ): software.amazon.awscdk.services.sns.TopicProps =
    (new software.amazon.awscdk.services.sns.TopicProps.Builder)
      .displayName(displayName.orNull)
      .topicName(topicName.orNull)
      .contentBasedDeduplication(contentBasedDeduplication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .masterKey(masterKey.orNull)
      .fifo(fifo.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
