package io.burkard.cdk.services.sns

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TopicPolicyProps {

  def apply(
    topics: Option[List[_ <: software.amazon.awscdk.services.sns.ITopic]] = None,
    policyDocument: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None
  ): software.amazon.awscdk.services.sns.TopicPolicyProps =
    (new software.amazon.awscdk.services.sns.TopicPolicyProps.Builder)
      .topics(topics.map(_.asJava).orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
