package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
