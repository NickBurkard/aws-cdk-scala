package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JsonSchema {

  def apply(
    pattern: Option[String] = None,
    additionalItems: Option[List[_ <: software.amazon.awscdk.services.apigateway.JsonSchema]] = None,
    id: Option[String] = None,
    exclusiveMinimum: Option[Boolean] = None,
    additionalProperties0: Option[software.amazon.awscdk.services.apigateway.JsonSchema] = None,
    additionalProperties1: Option[Boolean] = None,
    allOf: Option[List[_ <: software.amazon.awscdk.services.apigateway.JsonSchema]] = None,
    exclusiveMaximum: Option[Boolean] = None,
    format: Option[String] = None,
    description: Option[String] = None,
    anyOf: Option[List[_ <: software.amazon.awscdk.services.apigateway.JsonSchema]] = None,
    patternProperties: Option[Map[String, _ <: software.amazon.awscdk.services.apigateway.JsonSchema]] = None,
    items0: Option[software.amazon.awscdk.services.apigateway.JsonSchema] = None,
    items1: Option[List[_ <: software.amazon.awscdk.services.apigateway.JsonSchema]] = None,
    maxProperties: Option[Number] = None,
    ref: Option[String] = None,
    enumValue: Option[List[_]] = None,
    maxItems: Option[Number] = None,
    maximum: Option[Number] = None,
    multipleOf: Option[Number] = None,
    schema: Option[software.amazon.awscdk.services.apigateway.JsonSchemaVersion] = None,
    properties: Option[Map[String, _ <: software.amazon.awscdk.services.apigateway.JsonSchema]] = None,
    minItems: Option[Number] = None,
    not: Option[software.amazon.awscdk.services.apigateway.JsonSchema] = None,
    definitions: Option[Map[String, _ <: software.amazon.awscdk.services.apigateway.JsonSchema]] = None,
    minLength: Option[Number] = None,
    title: Option[String] = None,
    minimum: Option[Number] = None,
    type0: Option[software.amazon.awscdk.services.apigateway.JsonSchemaType] = None,
    type1: Option[List[_ <: software.amazon.awscdk.services.apigateway.JsonSchemaType]] = None,
    required: Option[List[String]] = None,
    defaultValue: Option[AnyRef] = None,
    contains0: Option[software.amazon.awscdk.services.apigateway.JsonSchema] = None,
    contains1: Option[List[_ <: software.amazon.awscdk.services.apigateway.JsonSchema]] = None,
    oneOf: Option[List[_ <: software.amazon.awscdk.services.apigateway.JsonSchema]] = None,
    uniqueItems: Option[Boolean] = None,
    minProperties: Option[Number] = None,
    propertyNames: Option[software.amazon.awscdk.services.apigateway.JsonSchema] = None,
    dependencies: Option[Map[String, _]] = None,
    maxLength: Option[Number] = None
  ): software.amazon.awscdk.services.apigateway.JsonSchema =
    (new software.amazon.awscdk.services.apigateway.JsonSchema.Builder)
      .pattern(pattern.orNull)
      .additionalItems(additionalItems.map(_.asJava).orNull)
      .id(id.orNull)
      .exclusiveMinimum(exclusiveMinimum.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .additionalProperties(additionalProperties0.orNull)
      .additionalProperties(additionalProperties1.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allOf(allOf.map(_.asJava).orNull)
      .exclusiveMaximum(exclusiveMaximum.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .format(format.orNull)
      .description(description.orNull)
      .anyOf(anyOf.map(_.asJava).orNull)
      .patternProperties(patternProperties.map(_.asJava).orNull)
      .items(items0.orNull)
      .items(items1.map(_.asJava).orNull)
      .maxProperties(maxProperties.orNull)
      .ref(ref.orNull)
      .enumValue(enumValue.map(_.asJava).orNull)
      .maxItems(maxItems.orNull)
      .maximum(maximum.orNull)
      .multipleOf(multipleOf.orNull)
      .schema(schema.orNull)
      .properties(properties.map(_.asJava).orNull)
      .minItems(minItems.orNull)
      .not(not.orNull)
      .definitions(definitions.map(_.asJava).orNull)
      .minLength(minLength.orNull)
      .title(title.orNull)
      .minimum(minimum.orNull)
      .`type`(type0.orNull)
      .`type`(type1.map(_.asJava).orNull)
      .required(required.map(_.asJava).orNull)
      .defaultValue(defaultValue.orNull)
      .contains(contains0.orNull)
      .contains(contains1.map(_.asJava).orNull)
      .oneOf(oneOf.map(_.asJava).orNull)
      .uniqueItems(uniqueItems.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minProperties(minProperties.orNull)
      .propertyNames(propertyNames.orNull)
      .dependencies(dependencies.map(_.asJava).orNull)
      .maxLength(maxLength.orNull)
      .build()
}
