package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnContactListProps {

  def apply(
    topics: Option[List[_]] = None,
    contactListName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ses.CfnContactListProps =
    (new software.amazon.awscdk.services.ses.CfnContactListProps.Builder)
      .topics(topics.map(_.asJava).orNull)
      .contactListName(contactListName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
