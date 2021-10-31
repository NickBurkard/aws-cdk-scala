package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTopicPolicyProps {

  def apply(
    topics: Option[List[String]] = None,
    policyDocument: Option[AnyRef] = None
  ): software.amazon.awscdk.services.sns.CfnTopicPolicyProps =
    (new software.amazon.awscdk.services.sns.CfnTopicPolicyProps.Builder)
      .topics(topics.map(_.asJava).orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
