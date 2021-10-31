package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TableAttributes {

  def apply(
    tableStreamArn: Option[String] = None,
    globalIndexes: Option[List[String]] = None,
    tableName: Option[String] = None,
    localIndexes: Option[List[String]] = None,
    tableArn: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.dynamodb.TableAttributes =
    (new software.amazon.awscdk.services.dynamodb.TableAttributes.Builder)
      .tableStreamArn(tableStreamArn.orNull)
      .globalIndexes(globalIndexes.map(_.asJava).orNull)
      .tableName(tableName.orNull)
      .localIndexes(localIndexes.map(_.asJava).orNull)
      .tableArn(tableArn.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
