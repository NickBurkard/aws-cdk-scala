package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TopicPolicyProps {

  def apply(
    topics: List[_ <: software.amazon.awscdk.services.sns.ITopic],
    policyDocument: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None
  ): software.amazon.awscdk.services.sns.TopicPolicyProps =
    (new software.amazon.awscdk.services.sns.TopicPolicyProps.Builder)
      .topics(topics.asJava)
      .policyDocument(policyDocument.orNull)
      .build()
}
