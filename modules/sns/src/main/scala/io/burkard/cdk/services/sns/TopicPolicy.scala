package io.burkard.cdk.services.sns

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TopicPolicy {

  def apply(
    internalResourceId: String,
    topics: Option[List[_ <: software.amazon.awscdk.services.sns.ITopic]] = None,
    policyDocument: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sns.TopicPolicy =
    software.amazon.awscdk.services.sns.TopicPolicy.Builder
      .create(stackCtx, internalResourceId)
      .topics(topics.map(_.asJava).orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
