package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TopicPolicy {

  def apply(
    internalResourceId: String,
    topics: List[_ <: software.amazon.awscdk.services.sns.ITopic],
    policyDocument: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sns.TopicPolicy =
    software.amazon.awscdk.services.sns.TopicPolicy.Builder
      .create(stackCtx, internalResourceId)
      .topics(topics.asJava)
      .policyDocument(policyDocument.orNull)
      .build()
}
